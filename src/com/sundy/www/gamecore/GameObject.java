package com.sundy.www.gamecore;

import java.awt.Point;

public abstract class GameObject
{
	// 显示
	public abstract void show();

	// 隐藏
	public abstract void hide();

	// 获得坐标
	public abstract Point getPosition();

	// 获得x
	public abstract int getX();

	// 获得y
	public abstract int getY();

	// 设置坐标
	public abstract void setPosition(Point pos);

	// 设置坐标
	public abstract void setPosition(int x, int y);

	moveRight()
}
